/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.dmn.client.editors.expressions.types.invocation;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.google.gwt.user.client.Event;
import org.jboss.errai.common.client.dom.Div;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.SinkNative;
import org.jboss.errai.ui.shared.api.annotations.Templated;

@Templated
@Dependent
public class InvocationGridControlsImpl implements InvocationGridControls {

    @DataField("addParameterBinding")
    private Div addParameterBinding;

    private Presenter presenter;

    public InvocationGridControlsImpl() {
        //CDI proxy
    }

    @Inject
    public InvocationGridControlsImpl(final Div addParameterBinding) {
        this.addParameterBinding = addParameterBinding;
    }

    @Override
    public void init(final Presenter presenter) {
        this.presenter = presenter;
    }

    @EventHandler("addParameterBinding")
    @SinkNative(Event.ONCLICK)
    @SuppressWarnings("unused")
    public void onClickAddParameterBinding(final Event event) {
        presenter.addParameterBinding();
    }
}
