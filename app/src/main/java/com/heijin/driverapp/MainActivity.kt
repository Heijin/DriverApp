package com.heijin.driverapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (txtLogin.text.isEmpty() or txtPassword.text.isEmpty()) {
            Toast.makeText(this, "Заполните логин и пароль", Toast.LENGTH_LONG).show()
        } else {

            var retrofit = Retrofit.Builder()
                .baseUrl("https://rawgit.com/startandroid/data/master/messages/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            //var messagesApi = retrofit.create<PrlgApiAuth>(PrlgApiAuth::class.java)
            //var messages = messagesApi.messages()



            //val name = arrayOf("")

            /*val test = SimpleService
            val result = test.main(name)
            Log.d("retrofit",result.toString())*/
           /* val PRLGHttpService = retrofit.create<PRLGHttpService>(PRLGHttpService::class.java)
            val result = PRLGHttpService.getOrder()

            Log.d("retrofit",result.toString())*/



            //Toast.makeText(this, "Ошибка авторизации", Toast.LENGTH_LONG).show()
            //txtLogin.setText("try logon")
            //setContentView(R.layout.mainwork)

           /*var retrofit = Retrofit.Builder()
                .baseUrl("http://mercury.pr-lg.ru:81/trade11-3-tkach-http/hs/v1/oauth/token/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()*/

           // val apiService = PRLGApi.create()
            //apiService.search(/* search params go in here */)


            ///orders/view?id=17352258
        }
    }
}

