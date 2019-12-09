package elior.com.infrastructurekotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider

class NewInfraActivity : AppCompatActivity() {

    private lateinit var editWordView: EditText
    private lateinit var infraViewModel: InfraViewModel

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)

        editWordView = findViewById(R.id.edit_word)

        infraViewModel = ViewModelProvider(this).get(InfraViewModel::class.java)

        val button = findViewById<Button>(R.id.button_save)
        button.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(editWordView.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {
                val infra = editWordView.text.toString()
                val infraName = Infra(infra)
                infraViewModel.insert(infraName)
            }
            finish()
        }
    }

}
