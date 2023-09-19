package pablo.maruottolo.a02_ejemplorecogerinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import pablo.maruottolo.a02_ejemplorecogerinformacion.modelos.Usuarios;

public class MainActivity extends AppCompatActivity {

    //variables de interfas o vista

    private EditText txtEmail;
    private EditText txtPassword;
    private Button btnRegistro;


    //variable de logica

    ArrayList<Usuarios> listaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaUsuario = new ArrayList<>();
        inicializarVista();
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recuperar datos de las cajas de texto
                String email = txtEmail.getText().toString();
                String password = txtPassword.getText().toString();
                //guardar esos datos en un objeto usuario
                if(email.isEmpty() || password.isEmpty()){
                    //si no hay datos
                    Toast.makeText(MainActivity.this,"Faltan Datos",Toast.LENGTH_SHORT).show();
                }else{
                    //guardar esos datos en un objeto usuario
                    Usuarios miUsuario = new Usuarios(email,password);
                    //añadir ese usuario en la lista
                    listaUsuario.add(miUsuario);
                    //Mensajito resumen
                    Toast.makeText(MainActivity.this,"Guardado: " + miUsuario.toString(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private void inicializarVista() {

        txtEmail = findViewById(R.id.txtEmailMain);
        txtPassword = findViewById(R.id.txtPasswordMain);
        btnRegistro = findViewById(R.id.btnRegistrerMain);
    }
}