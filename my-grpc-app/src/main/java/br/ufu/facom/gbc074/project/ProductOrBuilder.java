// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file.proto

package br.ufu.facom.gbc074.project;

public interface ProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:project.Product)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Produto ID
   * </pre>
   *
   * <code>string PID = 1;</code>
   * @return The pID.
   */
  java.lang.String getPID();
  /**
   * <pre>
   * Produto ID
   * </pre>
   *
   * <code>string PID = 1;</code>
   * @return The bytes for pID.
   */
  com.google.protobuf.ByteString
      getPIDBytes();

  /**
   * <pre>
   * JSON string representing produto data: at least product name, price, and
   * quantity
   * </pre>
   *
   * <code>string data = 2;</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <pre>
   * JSON string representing produto data: at least product name, price, and
   * quantity
   * </pre>
   *
   * <code>string data = 2;</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();
}