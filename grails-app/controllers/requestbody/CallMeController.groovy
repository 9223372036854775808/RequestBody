package requestbody

class CallMeController {

    def index() { }
    
    def maybe(){
        def headers = ""
        def headerNames = request.headerNames
        
        while (headerNames.hasMoreElements()) {
                def headerName = headerNames.nextElement();
                def headerValue = request.getHeader(headerName);
                headers += headerName + ": " + headerValue + ", "
        }
        
        for(String s : headers){
            print s
        }
        
        String method = request.method
        String body = request.reader.text
        render "METHOD: " + method + "\nHEADERS:\n" + headers + "\nBODY:\n" + body
    }
    
}