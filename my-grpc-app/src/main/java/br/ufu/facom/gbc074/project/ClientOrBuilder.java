// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file.proto

package br.ufu.facom.gbc074.project;

public interface ClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:project.Client)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Client ID
   * </pre>
   *
   * <code>string CID = 1;</code>
   * @return The cID.
   */
  java.lang.String getCID();
  /**
   * <pre>
   * Client ID
   * </pre>
   *
   * <code>string CID = 1;</code>
   * @return The bytes for cID.
   */
  com.google.protobuf.ByteString
      getCIDBytes();

  /**
   * <pre>
   * JSON string representing client data: at least a name
   * </pre>
   *
   * <code>string data = 2;</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <pre>
   * JSON string representing client data: at least a name
   * </pre>
   *
   * <code>string data = 2;</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();
}