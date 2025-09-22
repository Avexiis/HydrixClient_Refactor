import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/***Supports legacy presets from past client versions*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnvPreset {
    @JsonProperty public String name;
    @JsonProperty public int sunColor;
    @JsonProperty public int fogColor;
    @JsonProperty public int fogNear;
    @JsonProperty public int fogFar;
    @JsonProperty public int timeOfDay;
    private float f4130; // sunIntensity
    private float f4131; // shadowIntensity
    private float f4137; // diffusion
    private float f4132; // fogIntensity
    private float f4138; // ambientLight
    private float f4139; // sunBrightness
    public float sunIntensity;
    public float shadowIntensity;
    public float diffusion;
    public float fogIntensity;
    public float ambientLight;
    public float sunBrightness;
    private float sunYaw;
    private float sunPitch;
    public int yawDeg;
    public int pitchDeg;
    public int skyId;
    public int un1, un2, un3, un4;
    public EnvPreset() {}
    public EnvPreset(String name) {
        this.name = name; 
    }
    @Override
    public String toString() {
        return name; 
    }
    @JsonSetter("f4130") 
    public void setF4130(float v) {
        this.f4130 = v;
        this.sunIntensity = v;
    }
    @JsonSetter("f4131") 
    public void setF4131(float v) {
        this.f4131 = v;
        this.shadowIntensity = v;
    }
    @JsonSetter("f4137") 
    public void setF4137(float v) {
        this.f4137 = v;
        this.diffusion = v;
    }
    @JsonSetter("f4132") 
    public void setF4132(float v) { 
        this.f4132 = v;
        this.fogIntensity = v;
    }
    @JsonSetter("f4138")
    public void setF4138(float v) {
        this.f4138 = v;
        this.ambientLight = v;
    }
    @JsonSetter("f4139") 
    public void setF4139(float v) { 
        this.f4139 = v;
        this.sunBrightness = v;
    }
    @JsonSetter("sunIntensity") 
    public void setSunIntensity(float v) {
        this.sunIntensity = v;
        this.f4130 = v;
    }
    @JsonSetter("shadowIntensity") 
    public void setShadowIntensity(float v) { 
        this.shadowIntensity = v;
        this.f4131 = v;
    }
    @JsonSetter("diffusion")     
    public void setDiffusion(float v) {
        this.diffusion = v;
        this.f4137 = v;
    }
    @JsonSetter("fogIntensity")   
    public void setFogIntensity(float v) {
        this.fogIntensity = v;
        this.f4132 = v;
    }
    @JsonSetter("ambientLight") 
    public void setAmbientLight(float v) {
        this.ambientLight = v;
        this.f4138 = v;
    }
    @JsonSetter("sunBrightness")  
    public void setSunBrightness(float v) { 
        this.sunBrightness = v;
        this.f4139  = v ;
    }

    @JsonSetter("sunYaw")  
    public void setSunYaw(float v) {
        this.sunYaw = v;  
        this.yawDeg = Math.round(v);
    }
    @JsonSetter("sunPitch") 
    public void setSunPitch(float v) {
        this.sunPitch = v; 
        this.pitchDeg = Math.round(v); 
    }

    @JsonSetter("yawDeg")  
    public void setYawDeg(int v) { 
        this.yawDeg = v;   
        this.sunYaw = v; 
    }
    @JsonSetter("pitchDeg")
    public void setPitchDeg(int v) {
        this.pitchDeg = v; 
        this.sunPitch = v; 
    }
    @JsonProperty("f4130") 
    public float getF4130() {
        return (f4130 != 0f) ? f4130 : sunIntensity;
    }
    @JsonProperty("f4131") 
    public float getF4131() { 
        return (f4131 != 0f) ? f4131 : shadowIntensity; 
    }
    @JsonProperty("f4137") 
    public float getF4137() { 
        return (f4137 != 0f) ? f4137 : diffusion; 
    }
    @JsonProperty("f4132")
    public float getF4132() { 
        return (f4132 != 0f) ? f4132 : fogIntensity; 
    }
    @JsonProperty("f4138")
    public float getF4138() { 
        return (f4138 != 0f) ? f4138 : ambientLight;
    }
    @JsonProperty("f4139") 
    public float getF4139() { 
        return (f4139 != 0f) ? f4139 : sunBrightness;
    }

    @JsonProperty("sunYaw")  
    public float getSunYaw() {  
        return (sunYaw   != 0f) ? sunYaw   : (float) yawDeg; 
    }
    @JsonProperty("sunPitch")
    public float getSunPitch() { 
        return (sunPitch != 0f) ? sunPitch : (float) pitchDeg; 
    }
}
