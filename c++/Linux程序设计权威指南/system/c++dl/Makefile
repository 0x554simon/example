COMPILE_FLAGS=
#OPTOMIZE=-
LINK_FLAGS= 

LIBS =  -ldl

LINK_FLAGS=

COMPILE_FLAGS= -g -fPIC

COMPILE_FLAGS_SO= -g -shared -fPIC

CXX =  g++ $(STUPID) 

MAKE=make

INCLUDE_DIRS =   

MYOBJECTS =  test.o
		

SO = child1.so

all: test

test:  $(MYOBJECTS) $(SO) 
	 $(CXX) -o test $(MYOBJECTS) $(LIBS) $(LINK_FLAGS) 
	 
%.o: %.cxx 
	$(CXX) $(COMPILE_FLAGS) $(OPTOMIZE) -c -o $@ $< $(INCLUDE_DIRS)

%.so: %.o
	$(CXX) $(COMPILE_FLAGS_SO) $(OPTOMIZE) -o $@ $< $(INCLUDE_DIRS)

clean:	
	rm -rf *.o test $(SO)

#  DO  NOT  DELETE THIS LINE -- make depend depends on it.
