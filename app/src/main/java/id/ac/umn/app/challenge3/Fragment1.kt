package id.ac.umn.app.challenge3

import android.content.Intent
import android.graphics.Insets.add
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import id.ac.umn.app.challenge3.databinding.Fragment1Binding

class Fragment1 : Fragment() {
    private  var _binding : Fragment1Binding? = null
    private  val binding get() =  _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment1Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}






