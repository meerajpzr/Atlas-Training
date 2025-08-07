package Demo_Codes.Module02_DST.BuilderMethodDPpack;

public class BuilderDemo {
    public static void main(String[] args) {
        GadgetBuilder builder = new MobileGadgetBuilder();
        GadgetDirector director = new GadgetDirector(builder);
        Gadget mobile = director.constructGadget();

        mobile.showSpecs();  // Output: Mobile Specs: Storage = 512GB, Memory = 16GB
    }
}
