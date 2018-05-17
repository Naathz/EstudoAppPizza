package com.example.logonrm.apppizza

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //Clique do botão
    fun logar(v: View) {
        //recuperar valores
        val login = etLogin.text.toString()
        val senha = etSenha.text.toString()

        if (login == "FIAP" && senha == "123") {
            //mudar de tela
            val intent = Intent(this, PedidoActivity::class.java)
            //mandar dados
            intent.putExtra("usuario", login)

            //abrir a tela
            startActivity(intent)
            finish()
        }else{
            Toast.makeText(this, "Usuário ou senha inválida", Toast.LENGTH_LONG).show()
        }
    }


}



