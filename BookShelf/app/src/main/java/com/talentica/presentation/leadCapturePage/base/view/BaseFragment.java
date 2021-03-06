package com.talentica.presentation.leadCapturePage.base.view;


import android.support.v4.app.Fragment;

import com.talentica.presentation.internal.di.HasComponent;

public class BaseFragment extends Fragment {

    /**
     * Gets a component for dependency injection by its type.
     */

    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>) getActivity()).getComponent());
    }
}
