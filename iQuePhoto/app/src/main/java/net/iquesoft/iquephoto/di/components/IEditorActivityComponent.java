package net.iquesoft.iquephoto.di.components;

import net.iquesoft.iquephoto.di.ActivityScope;
import net.iquesoft.iquephoto.di.modules.EditorActivityModule;
import net.iquesoft.iquephoto.ui.fragment.AddTextFragment;
import net.iquesoft.iquephoto.ui.fragment.AdjustFragment;
import net.iquesoft.iquephoto.ui.fragment.DrawingFragment;
import net.iquesoft.iquephoto.ui.fragment.FiltersFragment;
import net.iquesoft.iquephoto.ui.activity.EditorActivity;
import net.iquesoft.iquephoto.ui.fragment.FramesFragment;
import net.iquesoft.iquephoto.ui.fragment.OverlayFragment;
import net.iquesoft.iquephoto.ui.fragment.StickersFragment;
import net.iquesoft.iquephoto.ui.fragment.SliderControlFragment;
import net.iquesoft.iquephoto.ui.fragment.StickersToolFragment;
import net.iquesoft.iquephoto.ui.fragment.TiltShiftFragment;
import net.iquesoft.iquephoto.ui.fragment.ToolsFragment;
import net.iquesoft.iquephoto.ui.fragment.TransformFragment;
import net.iquesoft.iquephoto.ui.fragment.TransformHorizontalFragment;
import net.iquesoft.iquephoto.ui.fragment.TransformStraightenFragment;
import net.iquesoft.iquephoto.ui.fragment.TransformVerticalFragment;

import dagger.Component;

@ActivityScope
@Component(dependencies = IApplicationComponent.class,
        modules = EditorActivityModule.class)

public interface IEditorActivityComponent {

    void inject(EditorActivity editorActivity);

    void inject(ToolsFragment toolsFragment);

    void inject(FiltersFragment filtersFragment);

    void inject(AdjustFragment adjustFragment);

    void inject(AddTextFragment textFragment);

    void inject(DrawingFragment drawingFragment);

    void inject(StickersToolFragment stickersToolFragment);

    void inject(StickersFragment stickersFragment);

    void inject(OverlayFragment overlayFragment);

    void inject(FramesFragment framesFragment);

    void inject(TiltShiftFragment tiltShiftFragment);

    void inject(TransformFragment transformFragment);

    void inject(TransformHorizontalFragment transformHorizontalFragment);

    void inject(TransformStraightenFragment transformStraightenFragment);

    void inject(TransformVerticalFragment transformVerticalFragment);

    void inject(SliderControlFragment sliderControlFragment);
}