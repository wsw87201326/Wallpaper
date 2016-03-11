package com.wsw.wallpaper.ui.fragment;

import android.support.v4.app.Fragment;

import com.wsw.wallpaper.injector.HasComponent;

/**
 * Create By :wsw
 * 2016-02-26 09:31
 */
public abstract class BaseFragment extends Fragment implements IBaseFragment{

    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>) getActivity()).getComponent());
    }
}
