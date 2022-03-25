package id.ac.umn.app.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import id.ac.umn.app.challenge3.Fragment4.Companion.usia
import id.ac.umn.app.challenge3.databinding.Fragment2Binding
import id.ac.umn.app.challenge3.databinding.Fragment3Binding


class Fragment3 : Fragment() {
    private var _binding: Fragment3Binding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment3Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<Data>("data")
//            ?.observe(viewLifecycleOwner) { (nama, usia, alamat, pekerjaan) ->
//                binding.ShowNama.visibility = View.VISIBLE
//                binding.ShowNama.text = "Nama : $nama"
//                binding.ShowUsia.visibility = View.VISIBLE
//                binding.ShowUsia.text = "Nama : $usia"
//                binding.ShowAlamat.visibility = View.VISIBLE
//                binding.ShowAlamat.text = "Nama : $alamat"
//                binding.ShowPekerjaan.visibility = View.VISIBLE
//                binding.ShowPekerjaan.text = "Nama : $pekerjaan"


//
        val nama = Fragment3Args.fromBundle(arguments as Bundle).name
        binding.ShowNama.text = "Nama Kamu : $nama"


        val alamat = Fragment3Args.fromBundle(arguments as Bundle).add
        binding.ShowAlamat.text = "Alamat Kamu : $alamat"

        val pekerjaan = Fragment3Args.fromBundle(arguments as Bundle).job
        binding.ShowPekerjaan.text = "Pekerjaan Kamu : $pekerjaan"

        val usia = Fragment3Args.fromBundle(arguments as Bundle).age
        binding.ShowUsia.text = "Usia Kamu : $usia"

        if (usia % 2 == 0) {
            binding.ShowUsia.text = "Usia Kamu : $usia bernilai genap"
        } else {
            binding.ShowUsia.text = "Usia Kamu : $usia  bernilai ganjil"

        }

        binding.button3.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragment3_to_fragment4)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}





