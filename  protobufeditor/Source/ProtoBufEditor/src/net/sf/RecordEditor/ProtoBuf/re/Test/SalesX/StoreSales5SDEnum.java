// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StoreSales5SD_Enum.proto

package net.sf.RecordEditor.ProtoBuf.re.Test.SalesX;

public final class StoreSales5SDEnum {
  private StoreSales5SDEnum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum SaleType
      implements com.google.protobuf.ProtocolMessageEnum {
    RETURN(0, -1),
    OTHER(1, 0),
    SALE(2, 1),
    ;
    
    public static final int RETURN_VALUE = -1;
    public static final int OTHER_VALUE = 0;
    public static final int SALE_VALUE = 1;
    
    
    public final int getNumber() { return value; }
    
    public static SaleType valueOf(int value) {
      switch (value) {
        case -1: return RETURN;
        case 0: return OTHER;
        case 1: return SALE;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<SaleType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<SaleType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SaleType>() {
            public SaleType findValueByNumber(int number) {
              return SaleType.valueOf(number);
            }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.StoreSales5SDEnum.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final SaleType[] VALUES = {
      RETURN, OTHER, SALE, 
    };
    
    public static SaleType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private SaleType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:net.sf.RecordEditor.ProtoBuf.re.Test.SalesX.SaleType)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030StoreSales5SD_Enum.proto\022+net.sf.Recor" +
      "dEditor.ProtoBuf.re.Test.SalesX*4\n\010SaleT" +
      "ype\022\023\n\006RETURN\020\377\377\377\377\377\377\377\377\377\001\022\t\n\005OTHER\020\000\022\010\n\004S" +
      "ALE\020\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
