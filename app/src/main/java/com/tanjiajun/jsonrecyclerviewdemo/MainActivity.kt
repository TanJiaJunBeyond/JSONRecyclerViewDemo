package com.tanjiajun.jsonrecyclerviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tanjiajun.jsonrecyclerview.view.JSONRecyclerView

/**
 * Created by TanJiaJun on 6/1/21.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<JSONRecyclerView>(R.id.rv_json).bindData(
            "{\n" +
                    "    \"string\":\"string\",\n" +
                    "    \"number\":100,\n" +
                    "    \"boolean\":true,\n" +
                    "    \"url\":\"https://github.com/TanJiaJunBeyond/JSONRecyclerView\",\n" +
                    "    \"JSONObject\":{\n" +
                    "        \"string\":\"string\",\n" +
                    "        \"number\":100,\n" +
                    "        \"boolean\":true\n" +
                    "    },\n" +
                    "    \"JSONArray\":[\n" +
                    "        {\n" +
                    "            \"string\":\"string\",\n" +
                    "            \"number\":100,\n" +
                    "            \"boolean\":true\n" +
                    "        }\n" +
                    "    ]\n" +
                    "}"
        )
    }

}