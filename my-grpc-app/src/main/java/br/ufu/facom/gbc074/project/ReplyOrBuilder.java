// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file.proto

package br.ufu.facom.gbc074.project;

public interface ReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:project.Reply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Error code: 0 for success
   * </pre>
   *
   * <code>int32 error = 1;</code>
   * @return The error.
   */
  int getError();

  /**
   * <pre>
   * Error message, if error &gt; 0
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Error message, if error &gt; 0
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Error message, if error &gt; 0
   * </pre>
   *
   * <code>string description = 2;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
