package android.example.roll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var btn : Button
    private lateinit var img : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.roll_button)
        img = findViewById(R.id.image)
        btn.setOnClickListener {
            val resource = when (Random.nextInt(6)+1){
                1->R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                else->R.drawable.dice_6
            }
            img.setImageResource(resource)
            Toast.makeText(this, "جامد", Toast.LENGTH_SHORT).show()
        }
    }
}