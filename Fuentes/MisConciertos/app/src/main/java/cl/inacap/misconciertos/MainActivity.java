package cl.inacap.misconciertos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Dialog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText fecha;
    EditText artistaTxt;
    EditText editnum;
    Button registrarBtn;
    private int dia,mes,anio;
    static final int DATE_ID = 0;
    Calendar c = Calendar.getInstance();
    private View.OnClickListener view;
    private Spinner spinnerGenero;
    private Spinner spinnerNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.fecha= findViewById(R.id.fecha);
        this.artistaTxt= findViewById(R.id.artistaTxt);
        this.editnum = findViewById(R.id.editnum);
        this.registrarBtn= findViewById(R.id.registrarBtn);

        spinnerGenero= (Spinner) findViewById(R.id.idSpinnerGeneros);
        String [] opciones = {"Rock","Jazz","Pop","Reguetoon","Salsa","Metal"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,opciones);
        spinnerGenero.setAdapter(adapter);

        spinnerNumero= (Spinner) findViewById(R.id.idSpinnerNumeros);
        Integer [] opciones2 = {1,2,3,4,5,6,7};
        ArrayAdapter <Integer> adapter2 = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_dropdown_item,opciones2);
        spinnerNumero.setAdapter(adapter2);

        dia=c.get(Calendar.DAY_OF_MONTH);
        mes=c.get(Calendar.MONTH);
        anio=c.get(Calendar.YEAR);
         fecha =(EditText) findViewById(R.id.fecha);
         fecha.setOnClickListener(view);
             showDialog(DATE_ID);
    }
             private void colocar_fecha(){
    fecha.setText((dia+"/"+(mes+1)+"/"+anio));
}
       DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
       public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){
       anio= year;
       mes= monthOfYear;
       dia= dayOfMonth;
       colocar_fecha();
       }
       };



            @Override
            public Dialog onCreateDialog(int id){
    switch (id){
        case DATE_ID:
            return new DatePickerDialog(this, onDateSetListener, dia,mes,anio);

    }
    return null;




                }

}


    }
