package id.ac.umn.app.challenge3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import id.ac.umn.app.challenge3.Fragment4.Companion.alamat
import id.ac.umn.app.challenge3.Fragment4.Companion.pekerjaan
import id.ac.umn.app.challenge3.Fragment4.Companion.usia
import id.ac.umn.app.challenge3.databinding.Fragment1Binding
import id.ac.umn.app.challenge3.databinding.Fragment2Binding


class Fragment2 : Fragment() {
    private var _binding: Fragment2Binding? = null
    private val binding get() = _binding!!



//    private fun serializable() {
//        val nama = binding.nama.text.toString()
//
//        val intent = Intent(this, Fragment3::class.java)
//        val fragment2 = Data("$nama")
//        intent.putExtra("object", fragment2)
//        startActivity(intent)
//    }


    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.button2.setOnClickListener {

//            val nama :String = view.nama.text.toString()

//            val intent = Intent(this, Fragment3::class.java)
//            val bundle = Bundle()
//            bundle.putString("nama", "$nama")
//            intent.putExtras(bundle)
//            startActivity(intent)


            if(binding.nama.text.isNullOrEmpty()){
                Toast.makeText(requireContext(),"Boleh Diisi Dulu", Toast.LENGTH_SHORT).show()
            }else{
                val actiontoFragment3 = Fragment2Directions.actionFragment2ToFragment3(nama,alamat,
                    pekerjaan)
                actiontoFragment3.name = binding.nama.text.toString()
                view.findNavController().navigate(actiontoFragment3)
            }
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object{
        val nama = "nama"

    }
}