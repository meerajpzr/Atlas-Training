package Demo_Codes.Module02_DST.BuilderMethodDPpack;

public class GadgetDirector {
    private Demo_Codes.Module02_DST.BuilderMethodDPpack.GadgetBuilder builder;

    public GadgetDirector(Demo_Codes.Module02_DST.BuilderMethodDPpack.GadgetBuilder builder) {
        this.builder = builder;
    }

    public Gadget constructGadget() {
        return builder.buildStorage(512).buildMemory(16).build();
    }
}
