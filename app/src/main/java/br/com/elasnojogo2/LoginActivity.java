package br.com.elasnojogo2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputLayout;
public class LoginActivity extends AppCompatActivity {
    private TextInputLayout email;
    private TextInputLayout senha;
    Button botao_cadastro;
    Button botao_entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//A Activity de Menu ainda será criada
                String email1 = email.getEditText().getText().toString();
                String senha1 = senha.getEditText().getText().toString();
                validarEmailSenha(email1, senha1);
            }
        });
    }
    private boolean validarEmailSenha(String emailInput, String senhaInput) {
        if (emailInput.isEmpty() && senhaInput.isEmpty()) {
            email.setError("Preencha os campos!");
            return false;
        } else {
            email.setError(null);
            return true;
        }
    }
    //    }
//
//    private boolean validarCampos(View view) {
//        String input = "Email: " + email.getEditText().getText().toString();
//        input += "\n";
//        input += "Senha: " + senha.getEditText().getText().toString();
//        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
//        if (!validarEmail() || !validarSenha()) {
//
//        }
//        return false;
//    }
    public void initViews() {
        email = findViewById(R.id.campo_email);
        senha = findViewById(R.id.campo_senha);
        botao_cadastro = findViewById(R.id.botao_cadastro);
        botao_entrar = findViewById(R.id.botao_entrar);
    }
}