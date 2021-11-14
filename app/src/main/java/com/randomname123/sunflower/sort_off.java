package com.randomname123.sunflower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class sort_off extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_off);

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
        Button button=findViewById(R.id.button3);
        button.setOnClickListener(this);

        Button btn1 = (Button) findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent =new Intent(this,coordinates.class);
        startActivity(intent);
    }
}