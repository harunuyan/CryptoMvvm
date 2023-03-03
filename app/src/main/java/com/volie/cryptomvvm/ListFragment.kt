package com.volie.cryptomvvm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.volie.cryptomvvm.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private var _mBinding: FragmentListBinding? = null
    private val mBinding get() = _mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _mBinding = FragmentListBinding.inflate(inflater,container,false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onDestroy() {
        super.onDestroy()
        _mBinding = null
    }

}