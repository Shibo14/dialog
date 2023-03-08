package khan.uz.myalertdialog

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.DialogInterface.OnCancelListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import khan.uz.myalertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val count = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val list = arrayOf(
                "Bmw", "Ford", "Audi"
            )
            val dialog = AlertDialog.Builder(this)
                .setTitle("Car Info")
                .setItems(list) { _, p ->
                    run {

                        if (p == 0) {
                            binding.imageView.setImageResource(R.drawable.ic_launcher_background)
                            binding.textView.text = "Bmw"
                        } else if (p == 1) {
                            binding.imageView.setImageResource(R.drawable.ic_launcher_foreground)
                            binding.textView.text = "Ford"
                        } else if (p == 2) {
                            binding.textView.text = "Audi"
                        }


                    }

                }
                .create()
            dialog.show()
        }
        binding.button2.text = "quit"
        binding.button2.setOnClickListener {
          AlertDialog.Builder(this)
                .setTitle("Quit")
                .setMessage("get out of the closet")
                .setPositiveButton("Ok") { _, p ->
                    run {
                        finish()
                    }

                }
                .setNegativeButton("Cancel") { _, p ->

                }
                .setCancelable(false)
                .create()
                .show()


        }


    }


}
