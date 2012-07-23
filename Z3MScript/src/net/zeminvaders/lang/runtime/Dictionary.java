/*
 * Copyright (c) 2008 Cameron Zemek
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
package net.zeminvaders.lang.runtime;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map data structure.
 *
 * @author <a href="mailto:grom@zeminvaders.net">Cameron Zemek</a>
 */
public class Dictionary extends ZemObject implements Iterable<Map.Entry<ZemObject, ZemObject>> {
    private Map<ZemObject, ZemObject> dict = new HashMap<ZemObject,ZemObject>();

    public Dictionary() {
    	
    }
    
    public Dictionary(Map<ZemObject, ZemObject> dict) {
        this.dict = dict;
    }

    public ZemObject get(ZemObject key) {
        return dict.get(key);
    }

    public void set(ZemObject key, ZemObject value) {
        dict.put(key, value);
    }

    @Override
    public int compareTo(ZemObject o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return dict.toString();
    }

    @Override
    public Iterator<Map.Entry<ZemObject, ZemObject>> iterator() {
        return dict.entrySet().iterator();
    }
}