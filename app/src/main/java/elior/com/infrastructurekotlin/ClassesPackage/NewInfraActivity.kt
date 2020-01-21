package elior.com.infrastructurekotlin.ClassesPackage

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import elior.com.infrastructurekotlin.ModelPackage.InfraModel
import elior.com.infrastructurekotlin.R
import elior.com.infrastructurekotlin.RoomPackage.InfraViewModel
import kotlinx.android.synthetic.main.activity_new_word.*

class NewInfraActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var infraViewModel: InfraViewModel

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)

        initUI()
        initListeners()
    }

    private fun initUI() {
        infraViewModel = ViewModelProvider(this).get(InfraViewModel::class.java)
    }

    private fun initListeners() {
        button_save.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.button_save -> {
                if (TextUtils.isEmpty(edit_word.text)) {
                    Toast.makeText(this, "Text Empty", Toast.LENGTH_LONG).show()
                } else {
                    val infra = edit_word.text.toString()
                    val infraName =
                        InfraModel(
                            infra
                        )
                    infraViewModel.insert(infraName)
                    finish()
                }
            }
        }
    }

}
