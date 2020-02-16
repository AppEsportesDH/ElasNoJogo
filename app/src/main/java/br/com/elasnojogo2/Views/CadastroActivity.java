package br.com.elasnojogo2.Views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import br.com.elasnojogo2.R;

public class CadastroActivity extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText telefone;
    private EditText senha;
    private EditText confirmarSenha;
    Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        cadastrar = findViewById(R.id.btn_cadastrar);

        cadastrar.setOnClickListener(clique);
    }

    View.OnClickListener clique = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(CadastroActivity.this, LoginActivity.class);
            Usuario usuario = new Usuario("Sol", "silmarasol@hotmail.com", "11996887098", "RFD234", "RFD234");

            Bundle bundle = new Bundle();
            bundle.putParcelable("Usuario", usuario);

            intent.putExtras(bundle);

            startActivity(intent);
        }
    };
}