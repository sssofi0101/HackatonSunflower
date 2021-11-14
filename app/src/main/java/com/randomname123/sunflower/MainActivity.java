package com.randomname123.sunflower;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] kinds = { "Дюрбан",
                "ЛГ 5377",
                "ЛГ 50270",
                "Ес Белла",
                "Нк Роки",
                "Ес Петунуниа",
                "Ес Савана",
                "Мегасан",
                "ЛГ 5485",
                "Тунка",
                "ЛГ 5580",
                "НК Брио",
                "НК Конди",
                "СИ Фламенко",
                "ЛГ 5463 КЛ",
                "Кодизоль КЛ",
                "Имерия КС",
                "НК Фортими",
                "ЕС Новамис КС",
                "ЕС Амил",
                "ЕС Террамис КЛ",
                "Фушия КЛ",
                "ЛГ 5543 КЛ",
                "ЛГ 5542 КЛ",
                "НК Неома",
                "СИ Эксперто",
                "ЕС Генезис",
                "ЕС Янис",
                "ЕС Каприс СЛП",
                "ЛГ 5555 КЛП",
                "ЛГ 50635 КЛП",
                "СИ Бакарди КЛП",
                "СИ Неостар КЛП",
                "Сумико",
                "ЕС Аркадия"};
        Spinner spinner = findViewById(R.id.spinner);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, kinds);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner.setAdapter(adapter);




        int[] grams = {52, 70, 65, 68, 48, 58, 56, 72, 72, 73, 75, 50, 50, 50, 72, 42, 56, 50, 60, 58,
                62, 50, 74, 71, 59, 51, 63, 63, 59, 71, 75, 54, 54, 70, 61};
        Button button=findViewById(R.id.button3);
        button.setOnClickListener(this);

        /*TextView textInput = findViewById(R.id.editTextNumber);
        String text = spinner.getSelectedItem().toString();
        for (int i=0;i<kinds.length;i++){
            if (kinds[i]==text){
                textInput.setText(Integer.toString(i));
            }
        }*/
        Button button2=findViewById(R.id.button);
        button.setOnClickListener(this);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tx=findViewById(R.id.textView9);
                tx.setText("643 ц/га");
                //Intent intent =new Intent(v.getContext(),Activity2.class);
                //startActivity(intent);
            }
        });
        //закрыть форму
        Button btn1 = (Button) findViewById(R.id.close);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Button btn1 = (Button) findViewById(R.id.close);
                btn1.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent intent =new Intent(v.getContext(),Activity1.class);
                        startActivity(intent);
                        mode.offlineMode=false;
                    }
                });
            }
        });
    }


    @Override
    public void onClick(View v) {
                fields.fieldsCount++;
                Intent intent =new Intent(this,coordinates.class);
                startActivity(intent);
    }

/*button.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(this, YourActivityName.class);
            startActivity(intent);
        }
    });*/
}