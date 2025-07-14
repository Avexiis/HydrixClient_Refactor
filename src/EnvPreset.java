import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EnvPreset {
    public String name;
    public int sunColor, fogColor, fogNear, fogFar, timeOfDay;
    public float f4130, f4131, f4137, f4132, f4138, f4139;
    public float sunYaw, sunPitch;

    @JsonCreator
    public EnvPreset(
        @JsonProperty("name")      String name,
        @JsonProperty("sunColor")  int sunColor,
        @JsonProperty("fogColor")  int fogColor,
        @JsonProperty("fogNear")   int fogNear,
        @JsonProperty("fogFar")    int fogFar,
        @JsonProperty("timeOfDay") int timeOfDay,
        @JsonProperty("f4130")     float f4130,
        @JsonProperty("f4131")     float f4131,
        @JsonProperty("f4137")     float f4137,
        @JsonProperty("f4132")     float f4132,
        @JsonProperty("f4138")     float f4138,
        @JsonProperty("f4139")     float f4139,
        @JsonProperty("sunYaw")    float sunYaw,
        @JsonProperty("sunPitch")  float sunPitch
    ) {
        this.name = name;
        this.sunColor = sunColor;
        this.fogColor = fogColor;
        this.fogNear = fogNear;
        this.fogFar = fogFar;
        this.timeOfDay = timeOfDay;
        this.f4130 = f4130;
        this.f4131 = f4131;
        this.f4137 = f4137;
        this.f4132 = f4132;
        this.f4138 = f4138;
        this.f4139 = f4139;
        this.sunYaw = sunYaw;
        this.sunPitch = sunPitch;
    }

    // Default constructor for Jackson
    public EnvPreset() {}

    @Override
    public String toString() {
        return name;
    }
}
