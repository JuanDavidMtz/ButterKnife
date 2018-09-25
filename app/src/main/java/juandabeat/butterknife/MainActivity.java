package juandabeat.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
   /* TextView textView;
    EditText editText;
    Button button;*/
   @BindView(R.id.textView) TextView textView;
   @BindView(R.id.editText) EditText editText;
   @OnClick(R.id.button) void enviar(){
       textView.setText(editText.getText().toString());
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        /*textView=(TextView)findViewById(R.id.textView);
        editText=(EditText)findViewById(R.id.editText);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato=editText.getText().toString();
                textView.setText(dato);
            }
        });*/
    }
}
