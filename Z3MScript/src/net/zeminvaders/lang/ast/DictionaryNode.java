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
package net.zeminvaders.lang.ast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.zeminvaders.lang.Interpreter;
import net.zeminvaders.lang.SourcePosition;
import net.zeminvaders.lang.runtime.Dictionary;
import net.zeminvaders.lang.runtime.DictionaryEntry;
import net.zeminvaders.lang.runtime.ZemObject;

/**
 * Dictionary contains key : value pairs.
 *
 * @author <a href="mailto:grom@zeminvaders.net">Cameron Zemek</a>
 */
public class DictionaryNode extends Node {
    private List<DictionaryEntryNode> elements;

    public DictionaryNode(SourcePosition pos, List<DictionaryEntryNode> elements) {
        super(pos);
        this.elements = elements;
    }

    @Override
    public ZemObject eval(Interpreter interpreter) {
        Map<ZemObject, ZemObject> entries = new HashMap<ZemObject, ZemObject>(elements.size());
        for (DictionaryEntryNode node : elements) {
            DictionaryEntry entry = (DictionaryEntry) node.eval(interpreter);
            entries.put(entry.getKey(), entry.getValue());
        }
        return new Dictionary(entries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(dict ");
        for (DictionaryEntryNode node : elements) {
            sb.append(node);
        }
        sb.append(")");
        return sb.toString();
    }
}
