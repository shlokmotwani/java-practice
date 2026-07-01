import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Launch {
    private final String missionName;
    private final String destination;
    private final List<String> payloadSpecs;
    private final int crewSize;
    private final String launchTime;
    private final boolean abortSystemActive;

    public Launch(LaunchBuilder builder){
        this.missionName = builder.getMissionName();
        this.destination = builder.getDestination();
        this.payloadSpecs = new ArrayList<String>(builder.getPayloadSpecs());
        this.crewSize = builder.getCrewSize();
        this.launchTime = builder.getLaunchTime();
        this.abortSystemActive = builder.isAbortSystemActive();
    }

    public String getMissionName() {
        return missionName;
    }

    public String getDestination() {
        return destination;
    }

    public List<String> getPayloadSpecs() {
        return Collections.unmodifiableList(payloadSpecs);
    }

    public int getCrewSize() {
        return crewSize;
    }

    public String getLaunchTime() {
        return launchTime;
    }

    public boolean isAbortSystemActive(){
        return abortSystemActive;
    }

    public LaunchBuilder getBuilder(){
        return new LaunchBuilder();
    }

    public static class LaunchBuilder{
        private String missionName;
        private String destination;
        private List<String> payloadSpecs = new ArrayList<String>();
        private int crewSize;
        private String launchTime;
        private boolean abortSystemActive;

        public String getMissionName() {
            return missionName;
        }

        public String getDestination() {
            return destination;
        }

        public List<String> getPayloadSpecs() {
            return payloadSpecs;
        }

        public int getCrewSize() {
            return crewSize;
        }

        public String getLaunchTime() {
            return launchTime;
        }

        public boolean isAbortSystemActive(){
            return this.abortSystemActive;
        }

        public LaunchBuilder setMissionName(String missionName) {
            this.missionName = missionName;
            return this;
        }

        public LaunchBuilder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public LaunchBuilder addPayloadSpecs(String payloadSpecs) {
            this.payloadSpecs.add(payloadSpecs);
            return this;
        }

        public LaunchBuilder setCrewSize(int crewSize) {
            this.crewSize = crewSize;
            return this;
        }

        public LaunchBuilder setLaunchTime(String launchTime) {
            this.launchTime = launchTime;
            return this;
        }

        public LaunchBuilder setAbortSystemActive(boolean abortSystemActive) {
            this.abortSystemActive = abortSystemActive;
            return this;
        }

        public Launch build(){
            if(this.missionName == null ||
                this.destination == null ||
                this.launchTime == null){
                throw new IllegalStateException("Required Fields: (MissionName, Destination, LaunchTime)");
            }

            if (!this.abortSystemActive) {
                throw new IllegalStateException("CRITICAL SAFETY ERROR: Abort System must be explicitly activated before launch.");
            }

            return new Launch(this);
        }
    }
}
