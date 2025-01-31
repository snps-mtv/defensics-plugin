/*
 * Copyright 2024 Black Duck Software, Inc. All rights reserved.
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

package com.defensics.jenkins.result;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.not;

import org.junit.Before;
import org.junit.Test;

public class ResultPackageActionTest {

  private static final String RESULT_PACKAGE = "result1.zip";
  private static final String RESULT_PACKAGE2 = "result2.zip";
  private ResultPackageAction resultPackageAction;

  @Before
  public void setup() {
    resultPackageAction = new ResultPackageAction(RESULT_PACKAGE);
  }

  @Test
  public void testGetResultPackage() {
    assertThat(resultPackageAction.getResultPackages(), contains(RESULT_PACKAGE));
  }

  @Test
  public void testGetResultPackages() {
    assertThat(resultPackageAction.getResultPackages(), contains(RESULT_PACKAGE));
    assertThat(resultPackageAction.getResultPackages(), not(contains(RESULT_PACKAGE2)));
    resultPackageAction.addResultPackage(RESULT_PACKAGE2, "");
    assertThat(resultPackageAction.getResultPackages(),
        containsInRelativeOrder(RESULT_PACKAGE, RESULT_PACKAGE2));
  }
}
