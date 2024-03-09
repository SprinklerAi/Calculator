package atilla.calculator;

import static java.lang.Double.parseDouble;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    protected EditText number1;
    private EditText number2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        number1 = findViewById(R.id.editFirstNumber);
        number2 = findViewById(R.id.editSecondNumber);
        result = findViewById(R.id.textSeeResult);

    }

    public void sum(View view) {
        double n1 = parseDouble(number1.getText().toString());
        double n2 = parseDouble(number2.getText().toString());

        result.setText(String.valueOf(n1 + n2));
    }
    public void minus(View view) {
        double n1 = parseDouble(number1.getText().toString());
        double n2 = parseDouble(number2.getText().toString());

        result.setText(String.valueOf(n1 - n2));
    }
    public void multiply(View view) {
        double n1 = parseDouble(number1.getText().toString());
        double n2 = parseDouble(number2.getText().toString());

        result.setText(String.valueOf(n1 * n2));
    }
    public void divide(View view) {
        double n1 = parseDouble(number1.getText().toString());
        double n2 = parseDouble(number2.getText().toString());

        if (n2 != 0) {
            result.setText(String.valueOf(n1 / n2));
        } else {
            result.setText("Nollalla jako ei ole määritelty.");
        }

    }
}