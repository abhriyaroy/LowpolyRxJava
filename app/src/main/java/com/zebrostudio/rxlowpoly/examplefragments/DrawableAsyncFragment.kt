package com.zebrostudio.rxlowpoly.examplefragments

import android.view.View
import com.zebrostudio.rxlowpoly.R
import com.zebrostudio.rxlowpoly.stringRes
import kotlinx.android.synthetic.main.fragment_example.view.*

class DrawableAsyncFragment : BaseFragment() {
  override fun configureView(view: View) {
    view.toolbarFragment.title = context!!.stringRes(R.string.drawable_async_example_fragment_name)
    view.imageView.setImageDrawable(resources.getDrawable(R.drawable.captain))
  }
}