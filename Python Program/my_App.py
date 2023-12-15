import kivy
from kivy.app import App
from kivy.uix.label import Label
class SpartonApp(App):
    def build(self):
        return Label(text="Hello Jay!!!")

if __name__=="__main__":
    SpartonApp().run()