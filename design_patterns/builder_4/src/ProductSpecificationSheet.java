import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSpecificationSheet {
    private final String modelNumber;
    private final String basePowerRequirements;
    private final List<String> safetyCertifications;
    private final List<String> performanceBenchmarks;
    private final List<String> regionalComplianceDetails;
    private final List<String> extendedWarrantyOptions;

    private ProductSpecificationSheet(PSSBuilder builder){
        this.modelNumber = builder.getModelNumber();
        this.basePowerRequirements = builder.getBasePowerRequirements();
        this.safetyCertifications = new ArrayList<>(builder.getSafetyCertifications());
        this.performanceBenchmarks = new ArrayList<>(builder.getPerformanceBenchmarks());
        this.regionalComplianceDetails = new ArrayList<>(builder.getRegionalComplianceDetails());
        this.extendedWarrantyOptions = new ArrayList<>(builder.getExtendedWarrantyOptions());
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getBasePowerRequirements() {
        return basePowerRequirements;
    }

    public List<String> getSafetyCertifications() {
        return Collections.unmodifiableList(safetyCertifications);
    }

    public List<String> getPerformanceBenchmarks() {
        return Collections.unmodifiableList(performanceBenchmarks);
    }

    public List<String> getRegionalComplianceDetails() {
        return Collections.unmodifiableList(regionalComplianceDetails);
    }

    public List<String> getExtendedWarrantyOptions() {
        return Collections.unmodifiableList(extendedWarrantyOptions);
    }


    public static class PSSBuilder{
        private String modelNumber;
        private String basePowerRequirements;
        private final List<String> safetyCertifications = new ArrayList<>();
        private final List<String> performanceBenchmarks = new ArrayList<>();
        private final List<String> regionalComplianceDetails = new ArrayList<>();
        private final List<String> extendedWarrantyOptions = new ArrayList<>();

        public String getModelNumber() {
            return modelNumber;
        }

        public String getBasePowerRequirements() {
            return basePowerRequirements;
        }

        public List<String> getSafetyCertifications() {
            return safetyCertifications;
        }

        public List<String> getPerformanceBenchmarks() {
            return performanceBenchmarks;
        }

        public List<String> getRegionalComplianceDetails() {
            return regionalComplianceDetails;
        }

        public List<String> getExtendedWarrantyOptions() {
            return extendedWarrantyOptions;
        }

        public PSSBuilder setModelNumber(String modelNumber){
            this.modelNumber = modelNumber;
            return this;
        }

        public PSSBuilder setBasePowerRequirements(String basePowerRequirements){
            this.basePowerRequirements = basePowerRequirements;
            return this;
        }

        public PSSBuilder addSafetyCertifications(String safetyCertification){
            this.safetyCertifications.add(safetyCertification);
            return this;
        }

        public PSSBuilder addPerformanceBenchmarks(String performanceBenchmark){
            this.performanceBenchmarks.add(performanceBenchmark);
            return this;
        }

        public PSSBuilder addRegionalComplianceDetails(String regionalComplianceDetail){
            this.regionalComplianceDetails.add(regionalComplianceDetail);
            return this;
        }

        public PSSBuilder addExtendedWarrantyOptions(String extendedWarrantyOption){
            this.extendedWarrantyOptions.add(extendedWarrantyOption);
            return this;
        }

        public ProductSpecificationSheet build(){
            if(this.modelNumber == null || this.basePowerRequirements == null){
                throw new IllegalStateException("Required Arguments: (Model Number, Base Power Requirements)");
            }
            return new ProductSpecificationSheet(this);
        }
    }
}
