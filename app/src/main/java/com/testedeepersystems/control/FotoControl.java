package com.testedeepersystems.control;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.testedeepersystems.R;
import com.testedeepersystems.model.Foto;
import com.testedeepersystems.view.ListarFotoActivity;

import java.io.File;

import cz.msebera.android.httpclient.Header;

public class FotoControl {
    private Activity activity;
    public static ImageView imageView;
    private Foto foto;

    public FotoControl(Activity activity) {
        this.activity = activity;
        initComponents();
    }

    private void initComponents() {
        imageView = activity.findViewById(R.id.imageView);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }


    public void selectImageAction() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File f = new File(activity.getExternalCacheDir().getPath(), "temp.jpg");
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f));
        activity.startActivityForResult(intent, 1);

    }

//    public void cadastroPostFoto() {
//        foto = getDadosForm();
//        Gson gson = new Gson();
//        RequestParams dado = new RequestParams("dado", gson.toJson(foto));
//        AsyncHttpClient client = new AsyncHttpClient();
//        String URL = "http://192.168.15.7:8080/TesteDeeperSystemsWS/api/webresources/testedeepersystems/foto";
//        client.post(URL, dado, new AsyncHttpResponseHandler() {
//
//            @Override
//            public void onStart() {
//                super.onStart();
//                Toast.makeText(activity.getApplicationContext(), "Iniciando requisição", Toast.LENGTH_LONG).show();
//
//            }
//
//            @Override
//            public void onRetry(int retryNo) {
//                super.onRetry(retryNo);
//
//            }
//
//            @Override
//            public void onSuccess(int i, Header[] headers, byte[] bytes) {
//
//                Toast.makeText(activity.getApplicationContext(), "Requisição Bem Sucedida", Toast.LENGTH_LONG).show();
//
//                Intent it = new Intent(activity.getApplicationContext(), ListarFotoActivity.class);
//                activity.startActivity(it);
//
//            }
//
//            @Override
//            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {
//                Toast.makeText(activity.getApplicationContext(), "Erro na requisição", Toast.LENGTH_LONG).show();
//            }
//
//
//        });
//
//
//    }


//    private Foto getDadosForm() {
//        Foto f = new Foto();
//        f.setNomeArquivo(imageView.getDrawable().toString());
//
//        return f;
//
//    }

}

