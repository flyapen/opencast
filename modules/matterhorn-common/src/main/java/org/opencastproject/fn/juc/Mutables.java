/**
 *  Copyright 2009, 2010 The Regents of the University of California
 *  Licensed under the Educational Community License, Version 2.0
 *  (the "License"); you may not use this file except in compliance
 *  with the License. You may obtain a copy of the License at
 *
 *  http://www.osedu.org/licenses/ECL-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS"
 *  BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 *  or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 */
package org.opencastproject.fn.juc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/** Constructor functions for mutable data types. */
public final class Mutables {
  private Mutables() {
  }

  public static <A> List<A> list() {
    return new ArrayList<A>();
  }

  public static <A> List<A> arrayList() {
    return new ArrayList<A>();
  }

  public static <A> List<A> arrayList(int initialCapacity) {
    return new ArrayList<A>(initialCapacity);
  }

  public static <A, B> Map<A, B> map() {
    return new HashMap<A, B>();
  }

  public static <A, B> Map<A, B> hashMap() {
    return new HashMap<A, B>();
  }

  public static <A> Stack<A> stack() {
    return new Stack<A>();
  }

  public static <A> Stack<A> stack(A... as) {
    final Stack<A> s = new Stack<A>();
    Collections.addAll(s, as);
    return s;
  }

  public static <A> Stack<A> stack(Collection<? extends A> as) {
    final Stack<A> s = new Stack<A>();
    for (A a : as) {
      s.push(a);
    }
    return s;
  }
}