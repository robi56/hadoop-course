/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package mr.reviews.fsstruct.avro.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ReviewReportAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ReviewReportAvro\",\"namespace\":\"mr.reviews.fsstruct.avro.model\",\"fields\":[{\"name\":\"user\",\"type\":\"string\"},{\"name\":\"keyword\",\"type\":\"string\"},{\"name\":\"numReviews\",\"type\":\"int\"},{\"name\":\"reviews\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ReviewAvro\",\"fields\":[{\"name\":\"user\",\"type\":\"string\"},{\"name\":\"text\",\"type\":\"string\"},{\"name\":\"timestamp\",\"type\":\"long\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence user;
  @Deprecated public java.lang.CharSequence keyword;
  @Deprecated public int numReviews;
  @Deprecated public java.util.List<mr.reviews.fsstruct.avro.model.ReviewAvro> reviews;

  /**
   * Default constructor.
   */
  public ReviewReportAvro() {}

  /**
   * All-args constructor.
   */
  public ReviewReportAvro(java.lang.CharSequence user, java.lang.CharSequence keyword, java.lang.Integer numReviews, java.util.List<mr.reviews.fsstruct.avro.model.ReviewAvro> reviews) {
    this.user = user;
    this.keyword = keyword;
    this.numReviews = numReviews;
    this.reviews = reviews;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return user;
    case 1: return keyword;
    case 2: return numReviews;
    case 3: return reviews;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: user = (java.lang.CharSequence)value$; break;
    case 1: keyword = (java.lang.CharSequence)value$; break;
    case 2: numReviews = (java.lang.Integer)value$; break;
    case 3: reviews = (java.util.List<mr.reviews.fsstruct.avro.model.ReviewAvro>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'user' field.
   */
  public java.lang.CharSequence getUser() {
    return user;
  }

  /**
   * Sets the value of the 'user' field.
   * @param value the value to set.
   */
  public void setUser(java.lang.CharSequence value) {
    this.user = value;
  }

  /**
   * Gets the value of the 'keyword' field.
   */
  public java.lang.CharSequence getKeyword() {
    return keyword;
  }

  /**
   * Sets the value of the 'keyword' field.
   * @param value the value to set.
   */
  public void setKeyword(java.lang.CharSequence value) {
    this.keyword = value;
  }

  /**
   * Gets the value of the 'numReviews' field.
   */
  public java.lang.Integer getNumReviews() {
    return numReviews;
  }

  /**
   * Sets the value of the 'numReviews' field.
   * @param value the value to set.
   */
  public void setNumReviews(java.lang.Integer value) {
    this.numReviews = value;
  }

  /**
   * Gets the value of the 'reviews' field.
   */
  public java.util.List<mr.reviews.fsstruct.avro.model.ReviewAvro> getReviews() {
    return reviews;
  }

  /**
   * Sets the value of the 'reviews' field.
   * @param value the value to set.
   */
  public void setReviews(java.util.List<mr.reviews.fsstruct.avro.model.ReviewAvro> value) {
    this.reviews = value;
  }

  /** Creates a new ReviewReportAvro RecordBuilder */
  public static mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder newBuilder() {
    return new mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder();
  }
  
  /** Creates a new ReviewReportAvro RecordBuilder by copying an existing Builder */
  public static mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder newBuilder(mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder other) {
    return new mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder(other);
  }
  
  /** Creates a new ReviewReportAvro RecordBuilder by copying an existing ReviewReportAvro instance */
  public static mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder newBuilder(mr.reviews.fsstruct.avro.model.ReviewReportAvro other) {
    return new mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder(other);
  }
  
  /**
   * RecordBuilder for ReviewReportAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ReviewReportAvro>
    implements org.apache.avro.data.RecordBuilder<ReviewReportAvro> {

    private java.lang.CharSequence user;
    private java.lang.CharSequence keyword;
    private int numReviews;
    private java.util.List<mr.reviews.fsstruct.avro.model.ReviewAvro> reviews;

    /** Creates a new Builder */
    private Builder() {
      super(mr.reviews.fsstruct.avro.model.ReviewReportAvro.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing ReviewReportAvro instance */
    private Builder(mr.reviews.fsstruct.avro.model.ReviewReportAvro other) {
            super(mr.reviews.fsstruct.avro.model.ReviewReportAvro.SCHEMA$);
      if (isValidValue(fields()[0], other.user)) {
        this.user = data().deepCopy(fields()[0].schema(), other.user);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.keyword)) {
        this.keyword = data().deepCopy(fields()[1].schema(), other.keyword);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.numReviews)) {
        this.numReviews = data().deepCopy(fields()[2].schema(), other.numReviews);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.reviews)) {
        this.reviews = data().deepCopy(fields()[3].schema(), other.reviews);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'user' field */
    public java.lang.CharSequence getUser() {
      return user;
    }
    
    /** Sets the value of the 'user' field */
    public mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder setUser(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.user = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'user' field has been set */
    public boolean hasUser() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'user' field */
    public mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder clearUser() {
      user = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'keyword' field */
    public java.lang.CharSequence getKeyword() {
      return keyword;
    }
    
    /** Sets the value of the 'keyword' field */
    public mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder setKeyword(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.keyword = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'keyword' field has been set */
    public boolean hasKeyword() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'keyword' field */
    public mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder clearKeyword() {
      keyword = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'numReviews' field */
    public java.lang.Integer getNumReviews() {
      return numReviews;
    }
    
    /** Sets the value of the 'numReviews' field */
    public mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder setNumReviews(int value) {
      validate(fields()[2], value);
      this.numReviews = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'numReviews' field has been set */
    public boolean hasNumReviews() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'numReviews' field */
    public mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder clearNumReviews() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'reviews' field */
    public java.util.List<mr.reviews.fsstruct.avro.model.ReviewAvro> getReviews() {
      return reviews;
    }
    
    /** Sets the value of the 'reviews' field */
    public mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder setReviews(java.util.List<mr.reviews.fsstruct.avro.model.ReviewAvro> value) {
      validate(fields()[3], value);
      this.reviews = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'reviews' field has been set */
    public boolean hasReviews() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'reviews' field */
    public mr.reviews.fsstruct.avro.model.ReviewReportAvro.Builder clearReviews() {
      reviews = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public ReviewReportAvro build() {
      try {
        ReviewReportAvro record = new ReviewReportAvro();
        record.user = fieldSetFlags()[0] ? this.user : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.keyword = fieldSetFlags()[1] ? this.keyword : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.numReviews = fieldSetFlags()[2] ? this.numReviews : (java.lang.Integer) defaultValue(fields()[2]);
        record.reviews = fieldSetFlags()[3] ? this.reviews : (java.util.List<mr.reviews.fsstruct.avro.model.ReviewAvro>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
