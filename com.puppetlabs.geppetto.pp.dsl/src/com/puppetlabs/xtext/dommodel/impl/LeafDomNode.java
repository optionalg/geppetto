/**
 * Copyright (c) 2013 Puppet Labs, Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Puppet Labs
 */
package com.puppetlabs.xtext.dommodel.impl;

import java.util.Iterator;

import com.puppetlabs.xtext.dommodel.IDomNode;

import com.google.common.collect.Iterators;

/**
 * A Leaf DomNode
 * 
 */
public class LeafDomNode extends BaseDomNode {

	@Override
	IDomNode getNodeAt(int index) {
		throw new UnsupportedOperationException("A LeafNode does not support getNodeAt(i)");
	}

	@Override
	public boolean hasChildren() {
		return false;
	}

	@Override
	public boolean isLeaf() {
		return true;
	}

	@Override
	public Iterator<IDomNode> treeIterator() {
		return Iterators.<IDomNode> singletonIterator(this);
	}
}
