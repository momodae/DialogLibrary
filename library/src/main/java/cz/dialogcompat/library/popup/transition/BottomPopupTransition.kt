package cz.dialogcompat.library.popup.transition

import android.animation.Animator
import android.animation.ObjectAnimator
import android.view.View

/**
 * Created by cz on 2017/12/13.
 */
class BottomPopupTransition: PopupTransition {

    override fun enterAnimator(target: View): Animator {
        return ObjectAnimator.ofFloat(target, "translationY", target.height * -1f)
    }

    override fun exitAnimator(target: View): Animator {
        return ObjectAnimator.ofFloat(target, "translationY", 0f)
    }

    override fun isShowing(target: View)=0f!=target.translationY
}