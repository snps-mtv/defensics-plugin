/*
 * Copyright © 2020-2023 Synopsys, Inc.
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

package com.synopsys.defensics.client.model;

public enum HtmlReport {
  Multiple("zip"), Single("single-html"), Cloud("cloud-html");

  private final String text;

  HtmlReport(String textual) {
    this.text = textual;
  }

  @Override
  public String toString() {
    return this.text;
  }
}
