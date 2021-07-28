package com.dev.exch22.Fragment;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.dev.exch22.APIService.Exchange22_API_Service;
import com.dev.exch22.Adapter.Exchange22_Matches_Adapter;
import com.dev.exch22.Model.Exchange22_Match;
import com.dev.exch22.R;
import com.dev.exch22.Exchange22_RetrofitInstance;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class Exchange22_Matches_Fragment extends Fragment {
    Exchange22_API_Service myService;
    RecyclerView recyclerView;
    Exchange22_Matches_Adapter adapter;
    Thread thread;
    FirebaseFirestore firebaseFirestore;
    public List<Exchange22_Match> versionList = new ArrayList<>();
    public List<Exchange22_Match> objectList = new ArrayList<>();
    DocumentReference documentReference;
    Gson gson;
    boolean connected = false;

    public Exchange22_Matches_Fragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_matches_, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        ConnectivityManager connectivityManager = (ConnectivityManager)getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        }
        else{
            Toast.makeText(getContext(), "Please turn on Internet", Toast.LENGTH_LONG).show();
            connected = false;
        }
        if (connected){
            myService = Exchange22_RetrofitInstance.getInstance().create(Exchange22_API_Service.class);
            gson = new Gson();


            Log.d("myTag", "onCreateView: ");
            getCourse();
            firebaseFirestore = FirebaseFirestore.getInstance();
            documentReference = firebaseFirestore.collection("matches_data")
                    .document("1");


        }


// Add a new document with a generated ID

        return view;
    }

    private void getCourse() {


        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://www.cricapi.com/api/matches")
                .method("GET", null)
                .addHeader("apikey", "fVBqVF8QNKNhDVsuSaIl61Pngmo1")
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Toast.makeText(getContext(), "fsiled to load", Toast.LENGTH_SHORT).show();
                getfirbasedata();

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        try {
                            JSONObject jsonObject = new JSONObject(response.body().string());

                            Type type = new TypeToken<List<Exchange22_Match>>() {
                            }.getType();

                            versionList = gson.fromJson(jsonObject.getJSONArray("matches").toString(), type);

                            Map<String, Object> user = new HashMap<>();
                            user.put("obj", jsonObject.toString());
                            documentReference.set(user);

                            getActivity().runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    adapter = new Exchange22_Matches_Adapter(versionList);
                                    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                                    recyclerView.setAdapter(adapter);
                                }
                            });

                        } catch (JSONException e) {
                            getfirbasedata();
                            e.printStackTrace();

                        }
                    }
                } else {
                    getActivity().runOnUiThread(new Runnable() {
                        public void run() {
                           getfirbasedata();
                        }
                    });
                }
            }
        });


    }

    private void getfirbasedata() {
        documentReference.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    if (task.getResult() != null) {

                        DocumentSnapshot documentSnapshot = task.getResult();
                        String stringobj = documentSnapshot.getString("obj");
                        JSONObject jsonObject = null;

                        try {
                            jsonObject = new JSONObject(stringobj);
                            Type type = new TypeToken<List<Exchange22_Match>>() {
                            }.getType();
                            objectList = gson.fromJson(jsonObject.getJSONArray("matches").toString(), type);
                            adapter = new Exchange22_Matches_Adapter(objectList);
                            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                            recyclerView.setAdapter(adapter);
                        } catch (JSONException jsonException) {
                            jsonException.printStackTrace();
                        }

                    }
                }
            }
        });

    }


}