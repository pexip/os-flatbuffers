// automatically generated by the FlatBuffers compiler, do not modify

package com.google.flatbuffers.reflection;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Schema extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static Schema getRootAsSchema(ByteBuffer _bb) { return getRootAsSchema(_bb, new Schema()); }
  public static Schema getRootAsSchema(ByteBuffer _bb, Schema obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public static boolean SchemaBufferHasIdentifier(ByteBuffer _bb) { return __has_identifier(_bb, "BFBS"); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Schema __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public com.google.flatbuffers.reflection.Object objects(int j) { return objects(new com.google.flatbuffers.reflection.Object(), j); }
  public com.google.flatbuffers.reflection.Object objects(com.google.flatbuffers.reflection.Object obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int objectsLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public com.google.flatbuffers.reflection.Object objectsByKey(String key) { int o = __offset(4); return o != 0 ? com.google.flatbuffers.reflection.Object.__lookup_by_key(null, __vector(o), key, bb) : null; }
  public com.google.flatbuffers.reflection.Object objectsByKey(com.google.flatbuffers.reflection.Object obj, String key) { int o = __offset(4); return o != 0 ? com.google.flatbuffers.reflection.Object.__lookup_by_key(obj, __vector(o), key, bb) : null; }
  public com.google.flatbuffers.reflection.Object.Vector objectsVector() { return objectsVector(new com.google.flatbuffers.reflection.Object.Vector()); }
  public com.google.flatbuffers.reflection.Object.Vector objectsVector(com.google.flatbuffers.reflection.Object.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public com.google.flatbuffers.reflection.Enum enums(int j) { return enums(new com.google.flatbuffers.reflection.Enum(), j); }
  public com.google.flatbuffers.reflection.Enum enums(com.google.flatbuffers.reflection.Enum obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int enumsLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public com.google.flatbuffers.reflection.Enum enumsByKey(String key) { int o = __offset(6); return o != 0 ? com.google.flatbuffers.reflection.Enum.__lookup_by_key(null, __vector(o), key, bb) : null; }
  public com.google.flatbuffers.reflection.Enum enumsByKey(com.google.flatbuffers.reflection.Enum obj, String key) { int o = __offset(6); return o != 0 ? com.google.flatbuffers.reflection.Enum.__lookup_by_key(obj, __vector(o), key, bb) : null; }
  public com.google.flatbuffers.reflection.Enum.Vector enumsVector() { return enumsVector(new com.google.flatbuffers.reflection.Enum.Vector()); }
  public com.google.flatbuffers.reflection.Enum.Vector enumsVector(com.google.flatbuffers.reflection.Enum.Vector obj) { int o = __offset(6); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String fileIdent() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fileIdentAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer fileIdentInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public String fileExt() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fileExtAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer fileExtInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public com.google.flatbuffers.reflection.Object rootTable() { return rootTable(new com.google.flatbuffers.reflection.Object()); }
  public com.google.flatbuffers.reflection.Object rootTable(com.google.flatbuffers.reflection.Object obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public com.google.flatbuffers.reflection.Service services(int j) { return services(new com.google.flatbuffers.reflection.Service(), j); }
  public com.google.flatbuffers.reflection.Service services(com.google.flatbuffers.reflection.Service obj, int j) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int servicesLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public com.google.flatbuffers.reflection.Service servicesByKey(String key) { int o = __offset(14); return o != 0 ? com.google.flatbuffers.reflection.Service.__lookup_by_key(null, __vector(o), key, bb) : null; }
  public com.google.flatbuffers.reflection.Service servicesByKey(com.google.flatbuffers.reflection.Service obj, String key) { int o = __offset(14); return o != 0 ? com.google.flatbuffers.reflection.Service.__lookup_by_key(obj, __vector(o), key, bb) : null; }
  public com.google.flatbuffers.reflection.Service.Vector servicesVector() { return servicesVector(new com.google.flatbuffers.reflection.Service.Vector()); }
  public com.google.flatbuffers.reflection.Service.Vector servicesVector(com.google.flatbuffers.reflection.Service.Vector obj) { int o = __offset(14); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public long advancedFeatures() { int o = __offset(16); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  /**
   * All the files used in this compilation. Files are relative to where
   * flatc was invoked.
   */
  public com.google.flatbuffers.reflection.SchemaFile fbsFiles(int j) { return fbsFiles(new com.google.flatbuffers.reflection.SchemaFile(), j); }
  public com.google.flatbuffers.reflection.SchemaFile fbsFiles(com.google.flatbuffers.reflection.SchemaFile obj, int j) { int o = __offset(18); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int fbsFilesLength() { int o = __offset(18); return o != 0 ? __vector_len(o) : 0; }
  public com.google.flatbuffers.reflection.SchemaFile fbsFilesByKey(String key) { int o = __offset(18); return o != 0 ? com.google.flatbuffers.reflection.SchemaFile.__lookup_by_key(null, __vector(o), key, bb) : null; }
  public com.google.flatbuffers.reflection.SchemaFile fbsFilesByKey(com.google.flatbuffers.reflection.SchemaFile obj, String key) { int o = __offset(18); return o != 0 ? com.google.flatbuffers.reflection.SchemaFile.__lookup_by_key(obj, __vector(o), key, bb) : null; }
  public com.google.flatbuffers.reflection.SchemaFile.Vector fbsFilesVector() { return fbsFilesVector(new com.google.flatbuffers.reflection.SchemaFile.Vector()); }
  public com.google.flatbuffers.reflection.SchemaFile.Vector fbsFilesVector(com.google.flatbuffers.reflection.SchemaFile.Vector obj) { int o = __offset(18); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createSchema(FlatBufferBuilder builder,
      int objectsOffset,
      int enumsOffset,
      int fileIdentOffset,
      int fileExtOffset,
      int rootTableOffset,
      int servicesOffset,
      long advancedFeatures,
      int fbsFilesOffset) {
    builder.startTable(8);
    Schema.addAdvancedFeatures(builder, advancedFeatures);
    Schema.addFbsFiles(builder, fbsFilesOffset);
    Schema.addServices(builder, servicesOffset);
    Schema.addRootTable(builder, rootTableOffset);
    Schema.addFileExt(builder, fileExtOffset);
    Schema.addFileIdent(builder, fileIdentOffset);
    Schema.addEnums(builder, enumsOffset);
    Schema.addObjects(builder, objectsOffset);
    return Schema.endSchema(builder);
  }

  public static void startSchema(FlatBufferBuilder builder) { builder.startTable(8); }
  public static void addObjects(FlatBufferBuilder builder, int objectsOffset) { builder.addOffset(0, objectsOffset, 0); }
  public static int createObjectsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startObjectsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addEnums(FlatBufferBuilder builder, int enumsOffset) { builder.addOffset(1, enumsOffset, 0); }
  public static int createEnumsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startEnumsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addFileIdent(FlatBufferBuilder builder, int fileIdentOffset) { builder.addOffset(2, fileIdentOffset, 0); }
  public static void addFileExt(FlatBufferBuilder builder, int fileExtOffset) { builder.addOffset(3, fileExtOffset, 0); }
  public static void addRootTable(FlatBufferBuilder builder, int rootTableOffset) { builder.addOffset(4, rootTableOffset, 0); }
  public static void addServices(FlatBufferBuilder builder, int servicesOffset) { builder.addOffset(5, servicesOffset, 0); }
  public static int createServicesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startServicesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addAdvancedFeatures(FlatBufferBuilder builder, long advancedFeatures) { builder.addLong(6, advancedFeatures, 0L); }
  public static void addFbsFiles(FlatBufferBuilder builder, int fbsFilesOffset) { builder.addOffset(7, fbsFilesOffset, 0); }
  public static int createFbsFilesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startFbsFilesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endSchema(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 4);  // objects
    builder.required(o, 6);  // enums
    return o;
  }
  public static void finishSchemaBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset, "BFBS"); }
  public static void finishSizePrefixedSchemaBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset, "BFBS"); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Schema get(int j) { return get(new Schema(), j); }
    public Schema get(Schema obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

