package com.zebrostudio.rxlowpoly.examplefragments

import android.view.View
import com.zebrostudio.rxlowpoly.R
import com.zebrostudio.rxlowpoly.stringRes
import kotlinx.android.synthetic.main.fragment_example.view.*

class UriAsyncFragment : BaseFragment() {
  override fun configureView(view: View) {
    view.toolbarFragment.title = context!!.stringRes(R.string.uri_async_example_fragment_name)
  }
}