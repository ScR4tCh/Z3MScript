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

/**
 * A key : value mapping in Dictionary.
 *
 * @author <a href="mailto:grom@zeminvaders.net">Cameron Zemek</a>
 */
public class DictionaryEntry extends ZemObject {
    private ZemObject key;
    private ZemObject value;

    public DictionaryEntry(ZemObject key, ZemObject value) {
        this.key = key;
        this.value = value;
    }

    public ZemObject getKey() {
        return key;
    }

    public ZemObject getValue() {
        return value;
    }

    public void setValue(ZemObject value) {
        this.value = value;
    }

    @Override
    public int compareTo(ZemObject o) {
        DictionaryEntry entry = (DictionaryEntry) o;
        return value.compareTo(entry.value);
    }

    @Override
    public String toString() {
        return key.toString() + "=" + value.toString();
    }
}
