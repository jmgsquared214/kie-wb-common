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

package org.kie.workbench.common.dmn.client.editors.expressions.types.function.supplementary;

import com.ait.lienzo.test.LienzoMockitoTestRunner;
import org.junit.runner.RunWith;
import org.kie.workbench.common.dmn.client.editors.expressions.types.function.supplementary.pmml.PMMLFunctionEditorDefinition;

@RunWith(LienzoMockitoTestRunner.class)
public class PMMLFunctionSupplementaryGridTest extends BaseFunctionSupplementaryGridTest<PMMLFunctionEditorDefinition> {

    protected PMMLFunctionEditorDefinition getEditorDefinition() {
        return new PMMLFunctionEditorDefinition(gridPanel,
                                                gridLayer,
                                                sessionManager,
                                                sessionCommandManager,
                                                expressionEditorDefinitionsSupplier,
                                                editorSelectedEvent);
    }

    protected String[] getExpectedNames() {
        return new String[]{PMMLFunctionEditorDefinition.VARIABLE_DOCUMENT, PMMLFunctionEditorDefinition.VARIABLE_MODEL};
    }
}
