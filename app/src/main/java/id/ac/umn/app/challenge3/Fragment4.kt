package id.ac.umn.app.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import id.ac.umn.app.challenge3.Fragment2.Companion.nama
import id.ac.umn.app.challenge3.databinding.Fragment2Binding
import id.ac.umn.app.challenge3.databinding.Fragment3Binding
import id.ac.umn.app.challenge3.databinding.Fragment4Binding


class Fragment4 : Fragment() {
    private var _binding: Fragment4Binding? = null
    private val binding get() = _binding!!

    companion object {
        val nama = " nama"
        val usia = "usia"
        val alamat = "alamat"
        val pekerjaan = "pekerjaan"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment4Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.button4.setOnClickListener {
            val actiontoFragment3 = Fragment4Directions.actionFragment4ToFragment3(
                nama, alamat, pekerjaan,
            )
            actiontoFragment3.age = binding.usia.inputType.toInt()
            actiontoFragment3.add = binding.alamat.text.toString()
            actiontoFragment3.job = binding.pekerjaan.text.toString()
            val data = Data(nama, 1, alamat, pekerjaan)
//            view.findNavController().navigate(actiontoFragment3)
            findNavController().previousBackStackEntry?.savedStateHandle?.set("data", data)
            findNavController().navigateUp()


        }


//
//            val actiontoFragment3 = Fragment4Directions.actionFragment4ToFragment3(
//                nama, alamat, pekerjaan,
//            )
//            actiontoFragment3.name = binding.nama.text.toString()
//            actiontoFragment3.age = binding.usia.inputType.toInt()
//            actiontoFragment3.add = binding.alamat.text.toString()
//            actiontoFragment3.job = binding.pekerjaan.text.toString()
//            view.findNavController().navigate(actiontoFragment3)
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    }

//}

//            if(binding.pekerjaan.text.isNullOrEmpty()){
//                Toast.makeText(requireContext(),"Boleh Diisi Dulu", Toast.LENGTH_SHORT).show()
//            }else{
//                val actiontoFragment3 = Fragment4Directions.actionFragment4ToFragment3(nama,usia,
//                    alamat, pekerjaan)
//                actiontoFragment3.job = binding.pekerjaan.text.toString()
//                view.findNavController().navigate(actiontoFragment3)
//            }

//            val mBundle = Bundle()
//            mBundle.putString(usia, "$usia")
//            mBundle.putString(alamat, "$alamat")
//            mBundle.putString(pekerjaan, "$pekerjaan")
//            it.findNavController().navigate(R.id.action_fragment4_to_fragment3,mBundle)


