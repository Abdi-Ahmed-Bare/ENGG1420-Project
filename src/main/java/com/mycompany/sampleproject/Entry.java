package com.mycompany.sampleproject;

/**
 *
 * @author Carter Rows
 */
// interface for each entry
public interface Entry {
    // gets the name of the entry
    String getName();
    // gets the length of the entry
    long getLength();
    // checks wether is directory or not
    boolean isDirectory();
}
